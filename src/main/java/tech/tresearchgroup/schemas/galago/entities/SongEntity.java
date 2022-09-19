package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeClass;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.ListIgnoreEmptyAdapter;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class SongEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String title;

    private FileEntity file;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "inAlbums") AlbumEntity> inAlbums;

    private String releaseDate;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "lyrics") LyricsEntity> lyrics;

    private Long views;

    public SongEntity(@Deserialize("created") Date created,
                      @Deserialize("updated") Date updated,
                      @Deserialize("id") Long id,
                      @Deserialize("title") String title,
                      @Deserialize("file") FileEntity file,
                      @Deserialize("inAlbums") List<AlbumEntity> inAlbums,
                      @Deserialize("releaseDate") String releaseDate,
                      @Deserialize("lyrics") List<LyricsEntity> lyrics,
                      @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.title = title;
        this.file = file;
        this.inAlbums = inAlbums;
        this.releaseDate = releaseDate;
        this.lyrics = lyrics;
        this.views = views;
    }

    @Serialize(order = 0)
    @SerializeNullable
    public Date getCreated() {
        return created;
    }

    @Serialize(order = 1)
    @SerializeNullable
    public Date getUpdated() {
        return updated;
    }

    @Serialize(order = 2)
    @SerializeNullable
    public Long getId() {
        return id;
    }

    @Serialize(order = 3)
    @SerializeNullable
    public String getTitle() {
        return title;
    }

    @Serialize(order = 4)
    public FileEntity getFile() {
        return file;
    }

    @Serialize(order = 5)
    public List<AlbumEntity> getInAlbums() {
        return inAlbums;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getReleaseDate() {
        return releaseDate;
    }

    @Serialize(order = 7)
    public List<LyricsEntity> getLyrics() {
        return lyrics;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
