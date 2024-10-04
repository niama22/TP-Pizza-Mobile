package com.example.pizza.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.Clases.Produit;
import com.example.pizza.R;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> list;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Produit> list, Activity activity) {
        this.list = list;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item, parent, false);
        }

        TextView nom = convertView.findViewById(R.id.textView4);
        TextView nbr = convertView.findViewById(R.id.textView5);
        TextView durree = convertView.findViewById(R.id.textView6);
        ImageView image1 = convertView.findViewById(R.id.imageView6);
        ImageView image2 = convertView.findViewById(R.id.imageView8);
        ImageView image3= convertView.findViewById(R.id.imageView9);

        ImageView image4= convertView.findViewById(R.id.imageView7);


        nom.setText(list.get(position).getNom());
        nbr.setText(String.valueOf(list.get(position).getNbrIngredients()));
        durree.setText(String.valueOf(list.get(position).getDuree()));
        image1.setImageResource(list.get(position).getPhoto());
        image2.setImageResource(R.drawable.alarme);
        image3.setImageResource(R.drawable.out);
        image4.setImageResource(R.drawable.man);

        return convertView;
    }
}
