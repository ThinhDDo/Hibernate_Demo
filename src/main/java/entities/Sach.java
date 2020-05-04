/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author doduy
 */
@Entity
@Table(name = "sach", schema="library")
public class Sach implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MASACH", unique=true)
    private int masach;
    @Column(name = "TENSACH", nullable=false)
    private String tensach;
    @Column(name = "GIA", nullable=false)
    private float gia;
    @Column(name = "SOLUONG", nullable=false)
    private int soluong;

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
    
    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }
    
    
    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    
    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    
    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "Sach{" + "masach=" + masach + ", tensach=" + tensach + ", gia=" + gia + ", soluong=" + soluong + '}';
    }
}
