package stem.list;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import stem.list.arrayadapter.ListItemAdapter;
import stem.list.model.UserModel;

public class UserDetailActivity extends AppCompatActivity {

    private Context context;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        init();
    }

    private void init() {
        context = this;
        listView = (ListView) findViewById(R.id.listView);

        setListValues();

    }

    private void setListValues() {
        ArrayList<UserModel> alUsers = new ArrayList<>();
        String verified;
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0)
                verified = "Verified";
            else
                verified = "Unverified";

            alUsers.add(new UserModel("Sandeep" + i, "sandeep@gmail.com" + i, verified));

        }

        ListItemAdapter adapter = new ListItemAdapter(context, R.layout.list_items, alUsers);
        listView.setAdapter(adapter);

    }

}
