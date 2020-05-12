/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author doduy
 */
@Entity
@Table(name = "sach", schema="library")
public class Sach {
    
    private int masach;
    private String tensach;
    private float gia;
    private int soluong;
    
    private List<TheLoai> categories = new ArrayList<TheLoai>();
    
    /**
     * Default Constructor
     */
    public Sach() {}
    
    public Sach(int masach, String tensach, float gia, int soluong) {
        this.masach = masach;
        this.tensach = tensach;
        this.gia = gia;
        this.soluong = soluong;
    }
    
    public Sach(String tensach, float gia, int soluong) {
        this.tensach = tensach;
        this.gia = gia;
        this.soluong = soluong;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MASACH", unique=true)
    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }
    
    
    @Column(name = "TENSACH", nullable=false)
    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    
    @Column(name = "GIA", nullable=false)
    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    
    @Column(name = "SOLUONG", nullable=false)
    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
    public List<TheLoai> getCategories() {
        return categories;
    }

    public void setCategories(List<TheLoai> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Sach{" + "masach=" + masach + ", tensach=" + tensach + ", gia=" + gia + ", soluong=" + soluong + '}';
    }
}
