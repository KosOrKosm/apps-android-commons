package fr.free.nrw.commons.upload;

import java.util.List;

import fr.free.nrw.commons.BasePresenter;
import fr.free.nrw.commons.filepicker.UploadableFile;

/**
 * The contract using which the UplaodActivity would communicate with its presenter
 */
public interface UploadContract {

    public interface View {

        boolean isLoggedIn();

        void finish();

        void returnToMainActivity();

        void askUserToLogIn();

        void showProgress(boolean shouldShow);

        void showMessage(int messageResourceId);

        List<UploadableFile> getUploadableFiles();

        void showHideTopCard(boolean shouldShow);

        void onUploadMediaDeleted(int index);

        void updateTopCardTitle();

        void makeUploadRequest();
    }

    public interface UserActionListener extends BasePresenter<View> {

        void handleSubmit();

        void deletePictureAtIndex(int index);
    }
}
