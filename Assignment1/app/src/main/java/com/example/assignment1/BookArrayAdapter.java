package com.example.assignment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BookArrayAdapter extends ArrayAdapter<Book> {
    public BookArrayAdapter(Context context, ArrayList<Book> books) {
        super(context, 0, books);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.content,
                    parent, false);
        } else {
            view = convertView;
        }
        Book book = getItem(position);
        TextView title = view.findViewById(R.id.title_text);
        TextView author = view.findViewById(R.id.author_text);
        TextView genre = view.findViewById(R.id.genre_text);
        TextView read_status = view.findViewById(R.id.read_status);

        title.setText(book.getTitle());
        author.setText(book.getAuthor());
        genre.setText(book.getGenre());
        read_status.setText(book.getRead_status());

        return view;
    }
}
