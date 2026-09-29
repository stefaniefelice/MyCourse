package com.example.mycourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class MateriFragment : Fragment() {

    private val materiList = arrayOf(
        "Linear Layout",
        "Relative Layout",
        "Constraint Layout",
        "Activity & Intent",
        "Spinner, Date Picker, Time Picker & Dialog",
        "Options Menu & Tab Layout"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_materi, container, false)

        val listView = view.findViewById<ListView>(R.id.lv_materi)
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            materiList
        )
        listView.adapter = adapter

        return view
    }
}