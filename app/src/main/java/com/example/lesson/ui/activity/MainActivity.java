package com.example.lesson.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.lesson.R;
import com.example.lesson.ui.data.QuestionsClient;
import com.example.lesson.ui.data.QuestionsModel;
import com.example.lesson.ui.fragments.adapter.QuestionsAdapter;
import com.example.lesson.databinding.ActivityMainBinding;
import com.example.lesson.ui.interfaces.ItemOnClickListener;
import com.example.lesson.ui.fragments.MainFragment;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    QuestionsAdapter questionsAdapter;
    ArrayList<QuestionsModel> questionList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialisation();
        listeners();
    }


    private void initialisation() {
        questionList = (ArrayList<QuestionsModel>) QuestionsClient.getListOfQuestions();
        questionsAdapter = new QuestionsAdapter(questionList);
        binding.recyclerView.setAdapter(questionsAdapter);

    }

    private void listeners() {
        questionsAdapter.setItemOnClickListener(new ItemOnClickListener() {
            @Override
            public void onItemClick(QuestionsModel questionModel) {
                MainFragment firstFragment = new MainFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("key", questionModel);
                firstFragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, firstFragment).commit();

            }
        });
    }
}