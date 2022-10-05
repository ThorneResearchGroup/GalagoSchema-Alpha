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

public class ArtistEntity extends BasicFormObject implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private String name;

    private ImageEntity primaryImage;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherImages") ImageEntity> otherImages;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "members") PersonEntity> members;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "albums") AlbumEntity> albums;

    private Long views;

    public ArtistEntity() {
    }

    public ArtistEntity(@Deserialize("created") Date created,
                        @Deserialize("updated") Date updated,
                        @Deserialize("id") Long id,
                        @Deserialize("lockType") LockType lockType,
                        @Deserialize("name") String name,
                        @Deserialize("primaryImage") ImageEntity primaryImage,
                        @Deserialize("otherImages") List<ImageEntity> otherImages,
                        @Deserialize("members") List<PersonEntity> members,
                        @Deserialize("albums") List<AlbumEntity> albums,
                        @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
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
    public ImageEntity getPrimaryImage() {
        return primaryImage;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public List<PersonEntity> getMembers() {
        return members;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public List<AlbumEntity> getAlbums() {
        return albums;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrimaryImage(ImageEntity primaryImage) {
        this.primaryImage = primaryImage;
    }

    public void setOtherImages(List<ImageEntity> otherImages) {
        this.otherImages = otherImages;
    }

    public void setMembers(List<PersonEntity> members) {
        this.members = members;
    }

    public void setAlbums(List<AlbumEntity> albums) {
        this.albums = albums;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
