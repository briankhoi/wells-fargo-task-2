package com.wellsfargo.counselor.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

	@ManyToOne
	private Client client;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client) {
        this.creationDate = new Date();
		this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
   