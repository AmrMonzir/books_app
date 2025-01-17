package com.plcoding.bookpedia

import BookListScreen
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar


//@Preview(backgroundColor = 0xFFFFFF)
//@Composable
//private fun BookSearchBarPreview() {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.White)
//    ) {
//        BookSearchBar(
//            searchQuery = "Search",
//            onSearchQueryChange = {},
//            onSearch = {},
//            modifier = Modifier.fillMaxWidth()
//        )
//    }
//}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        languages = emptyList(),
        authors = listOf("Amr Monzir"),
        averageRating = 4.5657,
        description = "Description $it",
        numEditions = 3,
        ratingCount = 5,
        numPages = 100,
        firstPublisher = "Amr Monzir Publisher"
    )
}

@Preview
@Composable
private fun BookListScreenPreview(modifier: Modifier = Modifier) {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {},
    )
}

