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

public class AlbumEntity extends BasicFormObject implements BasicObjectInterface {

    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private String name;

    private ImageEntity poster;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherImages") ImageEntity> otherImages;

    private String releaseDate;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "artists") ArtistEntity> artists;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "songs") SongEntity> songs;

    private Long views;

    public AlbumEntity() {
    }

    public AlbumEntity(@Deserialize("created") Date created,
                       @Deserialize("updated") Date updated,
                       @Deserialize("id") Long id,
                       @Deserialize("lockType") LockType lockType,
                       @Deserialize("name") String name,
                       @Deserialize("poster") ImageEntity poster,
                       @Deserialize("otherImages") List<ImageEntity> otherImages,
                       @Deserialize("releaseDate") String releaseDate,
                       @Deserialize("artists") List<ArtistEntity> artists,
                       @Deserialize("songs") List<SongEntity> songs,
                       @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.name = name;
        this.poster = poster;
        this.otherImages = otherImages;
        this.releaseDate = releaseDate;
        this.artists = artists;
        this.songs = songs;
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
    public String getName() {
        return name;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public ImageEntity getPoster() {
        return poster;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getReleaseDate() {
        return releaseDate;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public List<ArtistEntity> getArtists() {
        return artists;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public List<SongEntity> getSongs() {
        return songs;
    }

    @Serialize(order = 10)
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPoster(ImageEntity poster) {
        this.poster = poster;
    }

    public void setOtherImages(List<ImageEntity> otherImages) {
        this.otherImages = otherImages;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setArtists(List<ArtistEntity> artists) {
        this.artists = artists;
    }

    public void setSongs(List<SongEntity> songs) {
        this.songs = songs;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
