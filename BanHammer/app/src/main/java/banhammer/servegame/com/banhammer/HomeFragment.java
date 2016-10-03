package banhammer.servegame.com.banhammer;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Gabe on 02/10/2016.
 */
public class HomeFragment extends Fragment {

    private Dialog mExpandableDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.home_frag, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.open_dialog)
    public void openDialog() {
        mExpandableDialog = new Dialog(getContext(), R.style.MainMenuDialogTheme);
        mExpandableDialog.setContentView(R.layout.my_dialog_tests);

        mExpandableDialog.show();
    }
}
