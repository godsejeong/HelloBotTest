package com.jjmin.hellobottest.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

@Suppress("UNCHECKED_CAST")
abstract class BaseViewHolder<in T : Any?>(
    context: Context?,
    parent: ViewGroup,
    @LayoutRes layout: Int
) : RecyclerView.ViewHolder(
    LayoutInflater.from(context).inflate(layout, parent, false)
) {

    abstract fun View.onBind(item : T)

    fun onBind(item : Any?) {
        itemView.onBind(item as T)
    }
}