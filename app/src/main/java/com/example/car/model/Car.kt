package com.example.car.model

// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json = Json { allowStructuredMapKeys = true }
// val car  = json.parse(Car.serializer(), jsonString)

typealias Car = ArrayList<CarElement>

data class CarElement (
    val createdAt: String? = null,
    val name: String? = null,
    val avatar: String? = null,
    val id: String? = null
)
