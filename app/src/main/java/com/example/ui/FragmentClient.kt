package com.example.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment


class FragmentClient : Fragment() {
    private var isAttBookmark // 0: 북마크 비활성화 상태, 1: 북마크 활성화 상태
            = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        isAttBookmark = 0
        val view = inflater.inflate(R.layout.fragment_client, container, false)
        return view
    }
}