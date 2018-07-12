package com.example.soronto.myapplication

import com.google.gson.annotations.SerializedName

class IssacItem{
    @SerializedName("item_id")
    public var item_id:String?=null
    @SerializedName("name")
    public var name:String?=null
    @SerializedName("description")
    public var description:String?=null
    @SerializedName("img_src")
    public var img:Int?=null
    @SerializedName("battery")
    public var battery:Int?=null
    @SerializedName("quote")
    public var quote:String?=null
    @SerializedName("effects")
    public var effects:String?=null
    @SerializedName("notes")
    public var notes:String?=null
    @SerializedName("synergies")
    public var synergies:String?=null
    constructor(item_id:String,name:String,description:String,img:Int,battery:Int,
                qutoe:String,effects:String,notes:String,synergies:String){
        this.item_id=item_id
        this.name=name
        this.description=name
        this.img=img
        this.battery=battery
        this.quote=quote
        this.effects=effects
        this.notes=notes
        this.synergies=synergies
    }
    constructor(item_id: String, name:String, description:String, img:Int, quote:String){
        this.item_id=item_id
        this.name=name
        this.description=description
        this.img=img
        this.quote=quote
    }
}