package com.example.mikal.metro

/**
 * Created by mikal on 17/05/2018.
 */
class Metro {

    lateinit var code: String
    lateinit var name: String
    lateinit var directions: String
    lateinit var id: String

    // Parsing json
    constructor(){

    }


    constructor(code: String, ,name: String, directions: String, id: String){
        this.code = code
        this.name = name
        this.directions = directions
        this.id = id
    }


}