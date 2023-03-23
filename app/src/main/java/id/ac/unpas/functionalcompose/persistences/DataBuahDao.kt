package id.ac.unpas.functionalcompose.persistences
import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.functionalcompose.model.DataBuah

@Dao
interface DataBuahDao {
    @Query("SELECT * FROM DataBuah")
    fun loadAll(): LiveData<List<DataBuah>>
    @Query("SELECT * FROM DataBuah WHERE id = :id")
    fun find(id: String): DataBuah?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: DataBuah)
    @Delete
    fun delete(item: DataBuah)
}