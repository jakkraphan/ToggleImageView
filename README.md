# ToggleImageView
Toggle Image view is like **ToggleButton** but for images.

This library extend **ImageView** and contain custom **attributes**.

![Alt Text](https://github.com/pavelpoley/ToggleImageView/blob/master/toggle_image_view.gif)

### Usage

Activity

```
ToggleImageView toggleImageView = findViewById(R.id.toggleImageView);
        
        toggleImageView.addStateListener(new ToggleImageView.OnStateChangedListener() {
            @Override
            public void onChecked() {
                Log.d(TAG, "onChecked: ");
            }

            @Override
            public void onUnchecked() {
                Log.d(TAG, "onUnchecked: ");
            }
        });

        toggleImageView.setChecked();
```

xml
```
<pavelpoley.toggleimage.ToggleImageView
        android:id="@+id/toggleImageView"
        android:layout_width="200dp"
        android:layout_height="200dp"
        android:padding="50dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:src_checked="@drawable/ic_star_black_24dp"
        app:src_unchecked="@drawable/ic_star_border_black_24dp" />
```



