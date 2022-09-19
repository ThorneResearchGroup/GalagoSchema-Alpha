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
public class ArtistEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String name;

    private ImageEntity primaryImage;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherImages") ImageEntity> otherImages;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "members") PersonEntity> members;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "albums") AlbumEntity> albums;

    private Long views;

    public ArtistEntity(@Deserialize("created") Date created,
                        @Deserialize("updated") Date updated,
                        @Deserialize("id") Long id,
                        @Deserialize("name") String name,
                        @Deserialize("primaryImage") ImageEntity primaryImage,
                        @Deserialize("otherImages") List<ImageEntity> otherImages,
                        @Deserialize("members") List<PersonEntity> members,
                        @Deserialize("albums") List<AlbumEntity> albums,
                        @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.name = name;
        this.primaryImage = primaryImage;
        this.otherImages = otherImages;
        this.members = members;
        this.albums = albums;
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
    public ImageEntity getPrimaryImage() {
        return primaryImage;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public List<PersonEntity> getMembers() {
        return members;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public List<AlbumEntity> getAlbums() {
        return albums;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
