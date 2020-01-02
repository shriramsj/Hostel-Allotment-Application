package com.example.hostelallotmentapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuItemViewHolder extends RecyclerView.ViewHolder {

    TextView menuItemName, menuItemSide;
    Button book;
    String menuItemNameid, menuItemSideid;

    public MenuItemViewHolder(@NonNull final View itemView) {
        super(itemView);

        menuItemName = itemView.findViewById(R.id.hostel_name);
        menuItemSide = itemView.findViewById(R.id.hostel_side);
        book =  itemView.findViewById(R.id.book_btn);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent book = new Intent(itemView.getContext(), RoomBooking.class);
                //book.putExtra("name", menuItemNameid);
                itemView.getContext().startActivity(book);
            }
        });
    }
}
