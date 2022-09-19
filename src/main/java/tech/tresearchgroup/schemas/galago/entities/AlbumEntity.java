package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeClass;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.ListIgnoreEmptyAdapter;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class AlbumEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

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

    public AlbumEntity(@Deserialize("created") Date created,
                       @Deserialize("updated") Date updated,
                       @Deserialize("id") Long id,
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
    public String getName() {
        return name;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public ImageEntity getPoster() {
        return poster;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getReleaseDate() {
        return releaseDate;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public List<ArtistEntity> getArtists() {
        return artists;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public List<SongEntity> getSongs() {
        return songs;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
