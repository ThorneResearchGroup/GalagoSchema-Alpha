package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeClass;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;
import tech.tresearchgroup.schemas.galago.ListIgnoreEmptyAdapter;

import java.util.Date;
import java.util.List;

public class SongEntity extends BasicFormObject implements BasicObjectInterface {

    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private String title;

    private FileEntity file;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "inAlbums") AlbumEntity> inAlbums;

    private String releaseDate;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "lyrics") LyricsEntity> lyrics;

    private Long views;

    public SongEntity() {
    }

    public SongEntity(@Deserialize("created") Date created,
                      @Deserialize("updated") Date updated,
                      @Deserialize("id") Long id,
                      @Deserialize("lockType") LockType lockType,
                      @Deserialize("title") String title,
                      @Deserialize("file") FileEntity file,
                      @Deserialize("inAlbums") List<AlbumEntity> inAlbums,
                      @Deserialize("releaseDate") String releaseDate,
                      @Deserialize("lyrics") List<LyricsEntity> lyrics,
                      @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
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
    public LockType getLockType() {
        return lockType;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public String getTitle() {
        return title;
    }

    @Serialize(order = 5)
    public FileEntity getFile() {
        return file;
    }

    @Serialize(order = 6)
    public List<AlbumEntity> getInAlbums() {
        return inAlbums;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getReleaseDate() {
        return releaseDate;
    }

    @Serialize(order = 8)
    public List<LyricsEntity> getLyrics() {
        return lyrics;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public Long getViews() {
        return views;
    }

    @Override
    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setLockType(LockType lockType) {
        this.lockType = lockType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFile(FileEntity file) {
        this.file = file;
    }

    public void setInAlbums(List<AlbumEntity> inAlbums) {
        this.inAlbums = inAlbums;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setLyrics(List<LyricsEntity> lyrics) {
        this.lyrics = lyrics;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
