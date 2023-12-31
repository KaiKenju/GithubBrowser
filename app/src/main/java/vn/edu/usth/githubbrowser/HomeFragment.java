package vn.edu.usth.githubbrowser;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button issues = view.findViewById(R.id.btn_issues);
        Button pullRequests = view.findViewById(R.id.btn_pull_requests);
        Button discussion = view.findViewById(R.id.btn_discussion);
        Button project = view.findViewById(R.id.btn_project);
        Button repo = view.findViewById(R.id.btn_repositories);
        Button organizations = view.findViewById(R.id.btn_organizations);
        Button stared = view.findViewById(R.id.btn_stared);

        issues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnIssues = new Intent(getActivity(), IssueFragment.class);
                startActivity(btnIssues);
            }
        });

        pullRequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnPullRequests = new Intent(getActivity(), IssueFragment.class);
                startActivity(btnPullRequests);
            }
        });

        discussion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnDiscussion = new Intent(getActivity(), DiscussionFragment.class);
                startActivity(btnDiscussion);
            }
        });

        project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnProject = new Intent(getActivity(), ProjectFragment.class);
                startActivity(btnProject);
            }
        });

        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnRepositories = new Intent(getContext(), ApiActivity.class);
                startActivity(btnRepositories);
            }
        });

        organizations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnOrganizations = new Intent(getActivity(), IssueFragment.class);
                startActivity(btnOrganizations);
            }
        });

        stared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnStared = new Intent(getActivity(), IssueFragment.class);
                startActivity(btnStared);
            }
        });

        return view;
    }
}
