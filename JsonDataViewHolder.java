package oshin.tasnuva.mysql;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public  class JsonDataViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView name,description;



    public JsonDataViewHolder(@NonNull View itemView){
        super(itemView);


        imageView = itemView.findViewById(R.id.row_img);
        name = itemView.findViewById(R.id.row_name);
        description = itemView.findViewById(R.id.row_des);
    }


}
