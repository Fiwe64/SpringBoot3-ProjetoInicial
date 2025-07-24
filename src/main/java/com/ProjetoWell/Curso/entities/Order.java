package com.ProjetoWell.Curso.entities;

import com.ProjetoWell.Curso.entities.enums.OrderStatus;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    // Dizer pro banco de dados que estamos gravando um numero inteiro
    private Integer orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;


    @OneToMany(mappedBy = "id.order")// id que tem o pedido
    private Set<OrderItem> items = new HashSet<>();

    public Order(){}

    public Order(Long id, Instant moment,OrderStatus orderStatus,User client) {
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if(orderStatus!=null){
            this.orderStatus = orderStatus.getCode();
        }

    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }


    public Set<OrderItem> getItems(){
        return items;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
