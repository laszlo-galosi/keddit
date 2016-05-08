package com.largerlife.kotlin.keddit.listings

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.largerlife.kotlin.keddit.R
import com.largerlife.kotlin.keddit.commons.inflate
import kotlinx.android.synthetic.main.fragment_listing.*

/**
 * Created by László Gálosi on 08/05/16
 */

class ListingFragment : Fragment() {

    private val recyclerView by lazy {
        rv_main_content
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_listing)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView.setHasFixedSize(true) // use this setting to improve performance
        recyclerView.layoutManager = LinearLayoutManager(context)
    }
}
