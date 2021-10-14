package com.example.recyclerview_zaenarifputra_35

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PahlawanAdapter (private val context: Context, private val pahlawan: List<Pahlawan>, val listener: (Pahlawan) -> Unit)
    : RecyclerView.Adapter<PahlawanAdapter.PahlawanViewHolder>(){

    class PahlawanViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgPahlawan = view.findViewById<ImageView>(R.id.img_item_photo)
        val namePahlawan = view.findViewById<TextView>(R.id.tv_item_name)
        val descPahlawan = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(pahlawan: Pahlawan, listener: (Pahlawan) -> Unit) {
            imgPahlawan.setImageResource(pahlawan.imgPahlawan)
            namePahlawan.text = pahlawan.namePahlawan
            descPahlawan.text = pahlawan.descPahlawan
            itemView.setOnClickListener{
                (listener(pahlawan))
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PahlawanViewHolder {
        return PahlawanViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_pahlawan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PahlawanViewHolder, position: Int) {
         holder.bindView(pahlawan[position],listener)
    }

    override fun getItemCount(): Int = pahlawan.size
    }

