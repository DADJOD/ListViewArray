package com.example.listviewarray

import android.provider.BaseColumns
import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table

//@Table(name = "Sepulka", id = BaseColumns._ID)
@Table(name = "Sepulka", id = BaseColumns._ID)
class Sepulka : Model() {
    @Column(name = "foo")
    var foo: String? = null

    @Column(name = "bar")
    var bar: String? = null
}