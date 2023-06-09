package id.ac.unpas.functionalcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataBuah(
    @PrimaryKey val id: String,
    val tanggal: String,
    val nama: String,
    val berat: String,
    val harga: String
)
