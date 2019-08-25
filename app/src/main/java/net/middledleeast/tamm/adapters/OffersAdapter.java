package net.middledleeast.tamm.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import net.middledleeast.tamm.R;

import java.util.List;

public class OffersAdapter extends RecyclerView.Adapter<OffersAdapter.Offerviewholder> {
    Context context;
    int id ;
    Activity activity ;

    public OffersAdapter(Context context, Activity activity, List<String> listName , List<String> listImg , List<String> getListNameHotel, int id) {
        this.context = context;
        this.id=id;
        this.activity = activity;
        this.listName = listName;
        this.listImg = listImg;
        this.getListNameHotel = getListNameHotel;



    }

    List<String> listName ;
    List<String>listImg ;
    List<String> getListNameHotel;

    @NonNull
    @Override
    public Offerviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.offers_raw,parent,false);
        return new Offerviewholder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull Offerviewholder holder, int position) {

        if (id==1){

            String name = listName.get(position);
            String images = listImg.get(position);

            String hotelName  = getListNameHotel.get(position);
            holder.txtview1.setText(hotelName);

            holder.txtview2.setText(name);

            Glide.with(context).load(images).into(holder.imageView2);



        }else {

            holder.txtview1.setText("Huwai Pharmacy");
            holder.txtview2.setText("gjsafdjsafdaskliyuyr123456");
            holder.txtview3.setText("+95684712356");


        }




    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class Offerviewholder extends RecyclerView.ViewHolder {

        ImageView imageView1,imageView2;
        TextView txtview1,txtview2,txtview3;

        public Offerviewholder(@NonNull View itemView) {
            super(itemView);
            imageView1=itemView.findViewById(R.id.iv_star_offer);
            imageView2=itemView.findViewById(R.id.iv_image_offer);

            txtview1=itemView.findViewById(R.id.tv_one_offers);
            txtview2=itemView.findViewById(R.id.tv_address);
            txtview3=itemView.findViewById(R.id.tv_phone_offer);


        }
    }
}
