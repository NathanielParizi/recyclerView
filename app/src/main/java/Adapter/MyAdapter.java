package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jtanuki.go.recyclerview.R;

import java.util.List;

import Model.ListItems;

/**
 * Created by go on 9/3/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<ListItems> listItems;


    public MyAdapter(Context context, List listItem){

        this.context = context;
        this.listItems = listItem;





    }

    //======================= INFLATE XML
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
 View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listrow, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {

        holder.name.setText("Hello");
        holder.description.setText("Description");


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView description;

        public ViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);



        }
    }
}
