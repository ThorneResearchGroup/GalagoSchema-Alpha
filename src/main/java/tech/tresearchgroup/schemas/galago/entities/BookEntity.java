package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeClass;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.IntIgnoreZeroAdapter;
import tech.tresearchgroup.schemas.galago.ListIgnoreEmptyAdapter;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class BookEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

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

    public BookEntity(@Deserialize("created") Date created,
                      @Deserialize("updated") Date updated,
                      @Deserialize("id") Long id,
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
    public ImageEntity getPoster() {
        return poster;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public List<ImageEntity> getOtherImages() {
        return otherImages;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getTitle() {
        return title;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getDescription() {
        return description;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public List<FileEntity> getFiles() {
        return files;
    }

    @Serialize(order = 8)
    public int getPageCount() {
        return pageCount;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public List<PersonEntity> getAuthors() {
        return authors;
    }

    @Serialize(order = 10)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
