package com.faisal.tugas8

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*
import org.jetbrains.annotations.Nullable

class MyFriendsFragment : Fragment(){

    lateinit var listTeman: MutableList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("faisal","Laki-Laki",
                "ahmadfaisalstyh@gmail.com","+6282233445667","madura"))
        listTeman.add(MyFriend("fai","Laki-Laki",
            "alfinade@gmail.com","+6282233445667","madura"))
        listTeman.add(
            MyFriend("fai","Laki-Laki",
                "ahmadfaisalstyh@gmail.com","+6282233445667","madura"))
        listTeman.add(MyFriend("ahhay","Laki-Laki",
            "ahmadfaisalstyh@gmail.com","+6282233445667","madura"))
        listTeman.add(
            MyFriend("zal","Laki-Laki",
                "faisalstyh@gmail.com","+6282233445667","madura"))
        listTeman.add(MyFriend("aya","Laki-Laki",
            "faisalstyh@gmail.com","+6282233445667","madura"))


    }

    private fun tampilTeman(){
        rv_list.layoutManager= LinearLayoutManager(activity)
        rv_list.adapter=MyFriendAdapter(requireActivity(),listTeman)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()

    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}