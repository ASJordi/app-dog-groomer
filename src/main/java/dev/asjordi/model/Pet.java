package dev.asjordi.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
@Entity
@Table(name = "pets")
public class Pet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "pet_name")
    private String petName;
    
    @Column(name = "dog_breed")
    private String dogBreed;
    
    private String color;
    private Boolean allergic;
    
    @Column(name = "special_attention")
    private Boolean specialAttention;
    
    private String notes;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_owner")
    private Owner owner;

    public Pet() {}

    public Pet(String petName, String dogBreed, String color, Boolean allergic, Boolean specialAttention, String notes) {
        this.petName = petName;
        this.dogBreed = dogBreed;
        this.color = color;
        this.allergic = allergic;
        this.specialAttention = specialAttention;
        this.notes = notes;
    }

    public Pet(String petName, String dogBreed, String color, Boolean allergic, Boolean specialAttention, String notes, Owner owner) {
        this(petName, dogBreed, color, allergic, specialAttention, notes);
        this.owner = owner;
    }

    public Pet(Integer id, String petName, String dogBreed, String color, Boolean allergic, Boolean specialAttention, String notes, Owner owner) {
        this(petName, dogBreed, color, allergic, specialAttention, notes, owner);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getAllergic() {
        return allergic;
    }

    public void setAllergic(Boolean allergic) {
        this.allergic = allergic;
    }

    public Boolean getSpecialAttention() {
        return specialAttention;
    }

    public void setSpecialAttention(Boolean specialAttention) {
        this.specialAttention = specialAttention;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pet{");
        sb.append("id=").append(id);
        sb.append(", petName=").append(petName);
        sb.append(", dogBreed=").append(dogBreed);
        sb.append(", color=").append(color);
        sb.append(", allergic=").append(allergic);
        sb.append(", specialAttention=").append(specialAttention);
        sb.append(", notes=").append(notes);
        sb.append(", owner=").append(owner);
        sb.append('}');
        return sb.toString();
    }
    
}
