package com.example.mikal.metro.item

import android.view.View
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem

/**
 * Created by mikal on 17/05/2018.
 */
class MetroItem: AbstractItem<MetroItem, MetroItem.MetroViewHolder>() {
    override fun getLayoutRes(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getType(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getViewHolder(v: View?): MetroViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class MetroViewHolder(itemView: View?) : FastAdapter.ViewHolder<MetroItem>(itemView) {

        override fun unbindView(item: MetroItem?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun bindView(item: MetroItem?, payloads: MutableList<Any>?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }


    }
}