package xyz.deonico.ayamku.model;

import com.google.gson.annotations.SerializedName;

public class ResponseAyam {
    @SerializedName("createdAt")
    private String createdAt;

    @SerializedName("price")
    private String price;

    @SerializedName("url_photo")
    private String urlPhoto;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("quantity")
    private String quantity;

    @SerializedName("id")
    private String id;

    @SerializedName("updatedAt")
    private String updatedAt;

    public ResponseAyam(String id, String name, String description, String createdAt, String price, String url_photo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.price = price;
        this.urlPhoto = url_photo;
    }

    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }

    public String getCreatedAt(){
        return createdAt;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getPrice(){
        return price;
    }

    public void setUrlPhoto(String urlPhoto){
        this.urlPhoto = urlPhoto;
    }

    public String getUrlPhoto(){
        return urlPhoto;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public String getQuantity(){
        return quantity;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setUpdatedAt(String updatedAt){
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt(){
        return updatedAt;
    }

    @Override
    public String toString(){
        return
                "ResponseRepos{" +
                        "createdAt = '" + createdAt + '\'' +
                        ",price = '" + price + '\'' +
                        ",url_photo = '" + urlPhoto + '\'' +
                        ",name = '" + name + '\'' +
                        ",description = '" + description + '\'' +
                        ",id = '" + id + '\'' +
                        ",updatedAt = '" + updatedAt + '\'' +
                        "}";
    }
}
