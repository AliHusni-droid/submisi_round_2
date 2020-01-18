package com.example.marketplace.model;

import com.google.gson.annotations.SerializedName;

public class ProductModel{

	@SerializedName("id_barang")
	private String idBarang;

	@SerializedName("nama_barang")
	private String namaBarang;

	@SerializedName("harga_barang")
	private String hargaBarang;

	@SerializedName("deskripsi_barang")
	private String deskripsiBarang;

	@SerializedName("image_barang")
	private String imageBarang;

	@SerializedName("stok_barang")
	private String stokBarang;

	public void setIdBarang(String idBarang){
		this.idBarang = idBarang;
	}

	public String getIdBarang(){
		return idBarang;
	}

	public void setNamaBarang(String namaBarang){
		this.namaBarang = namaBarang;
	}

	public String getNamaBarang(){
		return namaBarang;
	}

	public void setHargaBarang(String hargaBarang){
		this.hargaBarang = hargaBarang;
	}

	public String getHargaBarang(){
		return hargaBarang;
	}

	public void setDeskripsiBarang(String deskripsiBarang){
		this.deskripsiBarang = deskripsiBarang;
	}

	public String getDeskripsiBarang(){
		return deskripsiBarang;
	}

	public void setImageBarang(String imageBarang){
		this.imageBarang = imageBarang;
	}

	public String getImageBarang(){
		return imageBarang;
	}

	public void setStokBarang(String stokBarang){
		this.stokBarang = stokBarang;
	}

	public String getStokBarang(){
		return stokBarang;
	}

	@Override
 	public String toString(){
		return 
			"com.example.marketplace.model.ProductModel{" +
			"id_barang = '" + idBarang + '\'' + 
			",nama_barang = '" + namaBarang + '\'' + 
			",harga_barang = '" + hargaBarang + '\'' + 
			",deskripsi_barang = '" + deskripsiBarang + '\'' + 
			",image_barang = '" + imageBarang + '\'' + 
			",stok_barang = '" + stokBarang + '\'' + 
			"}";
		}
}