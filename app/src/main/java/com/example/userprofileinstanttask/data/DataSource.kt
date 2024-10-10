package com.example.userprofileinstanttask.data

import com.example.userprofileinstanttask.R

class DataSource {

    fun getDataItems():List<Data>{
        val dataCall = mutableListOf<Data>()

        dataCall.add(
            Data(
                R.drawable.ronaldoa
                ,"Cristiano Ronaldo"
            )
        )

        dataCall.add(
            Data(
                R.drawable.benzema
                ,"Karem Benzema"
            )
        )

        dataCall.add(
            Data(
                R.drawable.belengham
                ,"jude bellingham"
            )
        )

        dataCall.add(
            Data(
                R.drawable.kros
                ,"Tony Kroos"
            )
        )

        dataCall.add(
            Data(
                R.drawable.kortoa
                ," kortoa"
            )
        )

        dataCall.add(
            Data(
                R.drawable.mbabe
                ,"Kylian Mbappe"
            )
        )

        dataCall.add(
            Data(
                R.drawable.marselo
                ,"Marcelo"
            )
        )

        dataCall.add(
            Data(
                R.drawable.modrech
                ,"Luca Modric"
            )
        )
        dataCall.add(
            Data(
                R.drawable.ozil
                ,"Masoud Ozil"
            )
        )

        dataCall.add(
            Data(
                R.drawable.ramos
                ,"Sergio Ramos"
            )
        )
        dataCall.add(
            Data(
                R.drawable.vini
                ,"Vinicius junior"
            )
        )

        dataCall.add(
            Data(
                R.drawable.rodrygo
                ,"Rodrygo"
            )
        )
        return dataCall
    }
}