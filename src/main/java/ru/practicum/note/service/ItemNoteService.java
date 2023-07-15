package ru.practicum.note.service;

import org.springframework.transaction.annotation.Transactional;
import ru.practicum.note.dto.ItemNoteDto;

import java.util.List;

@Transactional(readOnly = true)
public
interface ItemNoteService {

    @Transactional
    ItemNoteDto addNewItemNote(long userId, ItemNoteDto itemNoteDto);

    List<ItemNoteDto> searchNotesByUrl(String url, Long userId);

    List<ItemNoteDto> searchNotesByTag(long userId, String tag);

    List<ItemNoteDto> listAllItemsWithNotes(long userId, int from, int size);
}
