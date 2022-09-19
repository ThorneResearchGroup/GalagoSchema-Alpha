package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.enums.PlaybackQualityEnum;

import java.util.Date;

@Data
@NoArgsConstructor
public class VideoEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private String title;

    private ImageEntity primaryImage;

    private String filePath;

    private PlaybackQualityEnum playbackQualityEnum;

    private Long views;

    public VideoEntity(@Deserialize("created") Date created,
                       @Deserialize("updated") Date updated,
                       @Deserialize("id") Long id,
                       @Deserialize("title") String title,
                       @Deserialize("primaryImage") ImageEntity primaryImage,
                       @Deserialize("filePath") String filePath,
                       @Deserialize("playbackQualityEnum") PlaybackQualityEnum playbackQualityEnum,
                       @Deserialize("views") Long views) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.title = title;
        this.primaryImage = primaryImage;
        this.filePath = filePath;
        this.playbackQualityEnum = playbackQualityEnum;
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
    public ImageEntity getPrimaryImage() {
        return primaryImage;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getFilePath() {
        return filePath;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public PlaybackQualityEnum getPlaybackQualityEnum() {
        return playbackQualityEnum;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public Long getViews() {
        return views;
    }
}
