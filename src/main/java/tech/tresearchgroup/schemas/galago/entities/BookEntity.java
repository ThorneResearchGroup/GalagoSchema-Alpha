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

public class BookEntity extends BasicFormObject implements BasicObjectInterface {

    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;
    private ImageEntity poster;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "otherImages") ImageEntity> otherImages;

    private String title;

    private String description;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "files") FileEntity> files;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int pageCount;

    @JsonAdapter(ListIgnoreEmptyAdapter.class)
    private List<@SerializeClass(subclassesId = "authors") PersonEntity> authors;

    private Long views;

    public BookEntity() {
    }

    public BookEntity(@Deserialize("created") Date created,
                      @Deserialize("updated") Date updated,
                      @Deserialize("id") Long id,
                      @Deserialize("lockType") LockType lockType,
                      @Deserialize("poster") ImageEntity poster,
                      @Deserialize("otherImages") List<ImageEntity> otherImages,
                      @Deserialize("title") String title,
                      @Deserialize("description") String description,
                      @Deserialize("files") List<FileEntity> files,
                      @Deserialize("pageCount") int pageCount,
                      @Deserialize("authors") List<PersonEntity> authors,
                      @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.poster = poster;
        this.otherImages = otherImages;
        this.title = title;
        this.description = description;
        this.files = files;
        this.pageCount = pageCount;
        this.authors = authors;
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
    public String getTitle() {
        return title;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getDescription() {
        return description;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public List<FileEntity> getFiles() {
        return files;
    }

    @Serialize(order = 9)
    public int getPageCount() {
        return pageCount;
    }

    @Serialize(order = 10)
    @SerializeNullable
    public List<PersonEntity> getAuthors() {
        return authors;
    }

    @Serialize(order = 11)
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

    public void setPoster(ImageEntity poster) {
        this.poster = poster;
    }

    public void setOtherImages(List<ImageEntity> otherImages) {
        this.otherImages = otherImages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFiles(List<FileEntity> files) {
        this.files = files;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setAuthors(List<PersonEntity> authors) {
        this.authors = authors;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
