package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeClass;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.palila.model.LockType;
import tech.tresearchgroup.schemas.galago.IntIgnoreZeroAdapter;
import tech.tresearchgroup.schemas.galago.ListIgnoreEmptyAdapter;

import java.util.Date;
import java.util.List;

public class EpisodeEntity extends BasicFormObject implements BasicObjectInterface {

    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private String title;

    private String description;

    private ImageEntity poster;

    private String firstAired;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private Long runtime;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "filmLocations") LocationEntity> filmLocations;

    private String languages;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherImages") ImageEntity> otherImages;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherVideos") VideoEntity> otherVideos;

    public EpisodeEntity() {
    }

    public EpisodeEntity(@Deserialize("created") Date created,
                         @Deserialize("updated") Date updated,
                         @Deserialize("id") Long id,
                         @Deserialize("lockType") LockType lockType,
                         @Deserialize("title") String title,
                         @Deserialize("description") String description,
                         @Deserialize("poster") ImageEntity poster,
                         @Deserialize("firstAired") String firstAired,
                         @Deserialize("runtime") Long runtime,
                         @Deserialize("filmLocations") List<LocationEntity> filmLocations,
                         @Deserialize("languages") String languages,
                         @Deserialize("otherImages") List<ImageEntity> otherImages,
                         @Deserialize("otherVideos") List<VideoEntity> otherVideos) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.title = title;
        this.description = description;
        this.poster = poster;
        this.firstAired = firstAired;
        this.runtime = runtime;
        this.filmLocations = filmLocations;
        this.languages = languages;
        this.otherImages = otherImages;
        this.otherVideos = otherVideos;
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
    @SerializeNullable
    public String getDescription() {
        return description;
    }

    @Serialize(order = 6)
    public ImageEntity getPoster() {
        return poster;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getFirstAired() {
        return firstAired;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public Long getRuntime() {
        return runtime;
    }

    @Serialize(order = 9)
    public List<LocationEntity> getFilmLocations() {
        return filmLocations;
    }

    @Serialize(order = 10)
    @SerializeNullable
    public String getLanguages() {
        return languages;
    }

    @Serialize(order = 11)
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 12)
    public List<VideoEntity> getOtherVideos() {
        return otherVideos;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPoster(ImageEntity poster) {
        this.poster = poster;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public void setRuntime(Long runtime) {
        this.runtime = runtime;
    }

    public void setFilmLocations(List<LocationEntity> filmLocations) {
        this.filmLocations = filmLocations;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void setOtherImages(List<ImageEntity> otherImages) {
        this.otherImages = otherImages;
    }

    public void setOtherVideos(List<VideoEntity> otherVideos) {
        this.otherVideos = otherVideos;
    }
}
