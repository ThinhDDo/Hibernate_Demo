/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author doduy
 */
@Entity
@Table(name = "theloai", schema="library")
public class TheLoai {
    
    private String maTheLoai;
    private String tenTheLoai;
    private List<Sach> books = new ArrayList<Sach>(0);
    
    public TheLoai() {
    }
    
    public TheLoai(String maTheLoai, String tenTheLoai) {
        this.maTheLoai = maTheLoai;
        this.tenTheLoai = tenTheLoai;
    }

    @Id
    @Column(name="MATHELOAI", unique=true, nullable=false)
    public String getMaTheLoai() {
        return maTheLoai;
    }

    @Column(name="TENTHELOAI", nullable=false)
    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "sach_theloai", schema = "library", 
            joinColumns = {
                @JoinColumn(name = "MATHELOAI", 
                            nullable = false) },
            inverseJoinColumns = {
                @JoinColumn(name = "MASACH",
                            nullable = false) })
    public List<Sach> getBooks() {
        return books;
    }

    public void setBooks(List<Sach> books) {
        this.books = books;
    }
    
    @Override
    public String toString() {
        return "TheLoai{" + "maTheLoai=" + maTheLoai + ", tenTheLoai=" + tenTheLoai + '}';
    }
    
}
