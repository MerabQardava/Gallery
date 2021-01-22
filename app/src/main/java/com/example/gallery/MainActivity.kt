package com.example.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleview)

        val photolist = ArrayList<Photos>()
        photolist.add(Photos(1, "https://www.pandotrip.com/wp-content/uploads/2016/02/Rio3-1-980x699.jpg"))
        photolist.add(Photos(2, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUyQZ08rHPgSLnV0logR6D6Ljtde8jpud7eA&usqp=CAU"))
        photolist.add(Photos(3, "https://cdn.pocket-lint.com/r/s/1200x/assets/images/151442-cameras-feature-stunning-photos-from-the-national-sony-world-photography-awards-2020-image1-evuxphd3mr.jpg"))
        photolist.add(Photos(4, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjfsQp6Ay4_F5w8cmeaAPielCQ_238MeXTKQ&usqp=CAU"))
        photolist.add(Photos(5, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpTN60phjjjq_Bahjg2asXgjEZ9XxhTJdMDA&usqp=CAU"))
        photolist.add(Photos(7, "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/autumn-in-the-white-mountains-of-new-hampshire-royalty-free-image-841380450-1567025100.jpg?crop=0.668xw:1.00xh;0.167xw,0&resize=640:*"))
        photolist.add(Photos(8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYNLx7Ly59I6yE6FiVanuAPlJR4PQHTEQFIg&usqp=CAU"))
        photolist.add(Photos(9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDMmW3cEgkL4zVz9oCLrAakwosW3X6CpQUXw&usqp=CAU"))
        photolist.add(Photos(10, "https://images.pexels.com/photos/744667/pexels-photo-744667.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        photolist.add(Photos(11, "https://2sleepylagoonter.info/sites/autocar.co.uk/files/styles/body-image/public/1-corvette-stingray-c8-2019-fd-hr-hero-front_0.jpg?itok=SEYe_vLy"))
        photolist.add(Photos(12, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTXHAdECCUJjyj-GOLB9dnHlCmFkstbOgLWA&usqp=CAU"))
        photolist.add(Photos(1, "https://www.pandotrip.com/wp-content/uploads/2016/02/Rio3-1-980x699.jpg"))
        photolist.add(Photos(2, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUyQZ08rHPgSLnV0logR6D6Ljtde8jpud7eA&usqp=CAU"))
        photolist.add(Photos(3, "https://cdn.pocket-lint.com/r/s/1200x/assets/images/151442-cameras-feature-stunning-photos-from-the-national-sony-world-photography-awards-2020-image1-evuxphd3mr.jpg"))
        photolist.add(Photos(4, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjfsQp6Ay4_F5w8cmeaAPielCQ_238MeXTKQ&usqp=CAU"))
        photolist.add(Photos(5, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpTN60phjjjq_Bahjg2asXgjEZ9XxhTJdMDA&usqp=CAU"))
        photolist.add(Photos(7, "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/autumn-in-the-white-mountains-of-new-hampshire-royalty-free-image-841380450-1567025100.jpg?crop=0.668xw:1.00xh;0.167xw,0&resize=640:*"))
        photolist.add(Photos(8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYNLx7Ly59I6yE6FiVanuAPlJR4PQHTEQFIg&usqp=CAU"))
        photolist.add(Photos(9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDMmW3cEgkL4zVz9oCLrAakwosW3X6CpQUXw&usqp=CAU"))
        photolist.add(Photos(10, "https://images.pexels.com/photos/744667/pexels-photo-744667.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        photolist.add(Photos(11, "https://2sleepylagoonter.info/sites/autocar.co.uk/files/styles/body-image/public/1-corvette-stingray-c8-2019-fd-hr-hero-front_0.jpg?itok=SEYe_vLy"))
        photolist.add(Photos(12, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTXHAdECCUJjyj-GOLB9dnHlCmFkstbOgLWA&usqp=CAU"))
        photolist.add(Photos(1, "https://www.pandotrip.com/wp-content/uploads/2016/02/Rio3-1-980x699.jpg"))
        photolist.add(Photos(2, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUyQZ08rHPgSLnV0logR6D6Ljtde8jpud7eA&usqp=CAU"))
        photolist.add(Photos(3, "https://cdn.pocket-lint.com/r/s/1200x/assets/images/151442-cameras-feature-stunning-photos-from-the-national-sony-world-photography-awards-2020-image1-evuxphd3mr.jpg"))
        photolist.add(Photos(4, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjfsQp6Ay4_F5w8cmeaAPielCQ_238MeXTKQ&usqp=CAU"))
        photolist.add(Photos(5, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpTN60phjjjq_Bahjg2asXgjEZ9XxhTJdMDA&usqp=CAU"))
        photolist.add(Photos(7, "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/autumn-in-the-white-mountains-of-new-hampshire-royalty-free-image-841380450-1567025100.jpg?crop=0.668xw:1.00xh;0.167xw,0&resize=640:*"))
        photolist.add(Photos(8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYNLx7Ly59I6yE6FiVanuAPlJR4PQHTEQFIg&usqp=CAU"))
        photolist.add(Photos(9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDMmW3cEgkL4zVz9oCLrAakwosW3X6CpQUXw&usqp=CAU"))
        photolist.add(Photos(10, "https://images.pexels.com/photos/744667/pexels-photo-744667.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        photolist.add(Photos(11, "https://2sleepylagoonter.info/sites/autocar.co.uk/files/styles/body-image/public/1-corvette-stingray-c8-2019-fd-hr-hero-front_0.jpg?itok=SEYe_vLy"))
        photolist.add(Photos(12, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTXHAdECCUJjyj-GOLB9dnHlCmFkstbOgLWA&usqp=CAU"))
        photolist.add(Photos(1, "https://www.pandotrip.com/wp-content/uploads/2016/02/Rio3-1-980x699.jpg"))
        photolist.add(Photos(2, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUyQZ08rHPgSLnV0logR6D6Ljtde8jpud7eA&usqp=CAU"))
        photolist.add(Photos(3, "https://cdn.pocket-lint.com/r/s/1200x/assets/images/151442-cameras-feature-stunning-photos-from-the-national-sony-world-photography-awards-2020-image1-evuxphd3mr.jpg"))
        photolist.add(Photos(4, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjfsQp6Ay4_F5w8cmeaAPielCQ_238MeXTKQ&usqp=CAU"))
        photolist.add(Photos(5, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpTN60phjjjq_Bahjg2asXgjEZ9XxhTJdMDA&usqp=CAU"))
        photolist.add(Photos(7, "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/autumn-in-the-white-mountains-of-new-hampshire-royalty-free-image-841380450-1567025100.jpg?crop=0.668xw:1.00xh;0.167xw,0&resize=640:*"))
        photolist.add(Photos(8, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYNLx7Ly59I6yE6FiVanuAPlJR4PQHTEQFIg&usqp=CAU"))
        photolist.add(Photos(9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDMmW3cEgkL4zVz9oCLrAakwosW3X6CpQUXw&usqp=CAU"))
        photolist.add(Photos(10, "https://images.pexels.com/photos/744667/pexels-photo-744667.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        photolist.add(Photos(11, "https://2sleepylagoonter.info/sites/autocar.co.uk/files/styles/body-image/public/1-corvette-stingray-c8-2019-fd-hr-hero-front_0.jpg?itok=SEYe_vLy"))
        photolist.add(Photos(12, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTXHAdECCUJjyj-GOLB9dnHlCmFkstbOgLWA&usqp=CAU"))



        val photosAdapter = Adapter(photolist)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter =photosAdapter

    }
}