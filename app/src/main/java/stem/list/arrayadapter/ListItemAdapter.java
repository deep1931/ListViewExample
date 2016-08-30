package stem.list.arrayadapter;

/**
 * Created by sandeep on 8/27/16.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import stem.list.R;
import stem.list.model.UserModel;


public class ListItemAdapter extends ArrayAdapter<UserModel> {

    Context mContext;
    int layoutResourceId;
    ArrayList<UserModel> data = null;

    public ListItemAdapter(Context mContext, int layoutResourceId, ArrayList<UserModel> data) {

        super(mContext, layoutResourceId, data);

        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
        }

        ViewHolder holde = new ViewHolder();
        // object item based on the position
        UserModel objectItem = data.get(position);

        holde.txtEmail = (TextView) convertView.findViewById(R.id.txtEmail);
        holde.txtEmail.setText(objectItem.getEmailId());

        holde.txtName = (TextView) convertView.findViewById(R.id.txtName);
        holde.txtName.setText(objectItem.getName());

        holde.txtVerified = (TextView) convertView.findViewById(R.id.txtVerified);
        holde.txtVerified.setText(objectItem.getTimestamp());
        return convertView;

    }


    class ViewHolder {

        TextView txtName;
        TextView txtEmail;
        TextView txtVerified;
    }

}