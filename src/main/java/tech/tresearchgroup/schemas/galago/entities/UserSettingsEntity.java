package tech.tresearchgroup.schemas.galago.entities;

import com.google.gson.annotations.JsonAdapter;
import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.IntIgnoreZeroAdapter;
import tech.tresearchgroup.schemas.galago.enums.DisplayModeEnum;
import tech.tresearchgroup.schemas.galago.enums.InterfaceMethodEnum;
import tech.tresearchgroup.schemas.galago.enums.PlaybackQualityEnum;

import java.util.Date;

@Setter
@NoArgsConstructor
public class UserSettingsEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private InterfaceMethodEnum interfaceMethod;

    private PlaybackQualityEnum defaultPlaybackQuality;

    private DisplayModeEnum displayMode;

    private boolean tableShowPoster;

    private boolean tableShowName;

    private boolean tableShowRuntime;

    private boolean tableShowGenre;

    private boolean tableShowMpaaRating;

    private boolean tableShowUserRating;

    private boolean tableShowLanguage;

    private boolean tableShowReleaseDate;

    private boolean tableShowActions;

    private boolean homePageShowNewMovie;

    private boolean homePageShowNewTvShow;

    private boolean homePageShowNewGame;

    private boolean homePageShowNewBook;

    private boolean homePageShowNewMusic;

    private boolean homePageShowPopularMovie;

    private boolean homePageShowPopularTvShow;

    private boolean homePageShowPopularGame;

    private boolean homePageShowPopularBook;

    private boolean homePageShowPopularMusic;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int maxSearchResults;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int maxBrowseResults;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int fontSize;

    private String fontType;

    private String fontColor;

    @JsonAdapter(IntIgnoreZeroAdapter.class)
    private int cardWidth;

    private boolean stickyTopMenu;

    public UserSettingsEntity(@Deserialize("created") Date created,
                              @Deserialize("updated") Date updated,
                              @Deserialize("id") Long id,
                              @Deserialize("interfaceMethod") InterfaceMethodEnum interfaceMethod,
                              @Deserialize("defaultPlaybackQuality") PlaybackQualityEnum defaultPlaybackQuality,
                              @Deserialize("displayMode") DisplayModeEnum displayMode,
                              @Deserialize("tableShowPoster") boolean tableShowPoster,
                              @Deserialize("tableShowName") boolean tableShowName,
                              @Deserialize("tableShowRuntime") boolean tableShowRuntime,
                              @Deserialize("tableShowGenre") boolean tableShowGenre,
                              @Deserialize("tableShowMpaaRating") boolean tableShowMpaaRating,
                              @Deserialize("tableShowUserRating") boolean tableShowUserRating,
                              @Deserialize("tableShowLanguage") boolean tableShowLanguage,
                              @Deserialize("tableShowReleaseDate") boolean tableShowReleaseDate,
                              @Deserialize("tableShowActions") boolean tableShowActions,
                              @Deserialize("homePageShowNewMovie") boolean homePageShowNewMovie,
                              @Deserialize("homePageShowNewTvShow") boolean homePageShowNewTvShow,
                              @Deserialize("homePageShowNewGame") boolean homePageShowNewGame,
                              @Deserialize("homePageShowNewBook") boolean homePageShowNewBook,
                              @Deserialize("homePageShowNewMusic") boolean homePageShowNewMusic,
                              @Deserialize("homePageShowPopularMovie") boolean homePageShowPopularMovie,
                              @Deserialize("homePageShowPopularTvShow") boolean homePageShowPopularTvShow,
                              @Deserialize("homePageShowPopularGame") boolean homePageShowPopularGame,
                              @Deserialize("homePageShowPopularBook") boolean homePageShowPopularBook,
                              @Deserialize("homePageShowPopularMusic") boolean homePageShowPopularMusic,
                              @Deserialize("maxSearchResults") int maxSearchResults,
                              @Deserialize("maxBrowseResults") int maxBrowseResults,
                              @Deserialize("fontSize") int fontSize,
                              @Deserialize("fontType") String fontType,
                              @Deserialize("fontColor") String fontColor,
                              @Deserialize("cardWidth") int cardWidth,
                              @Deserialize("stickyTopMenu") boolean stickyTopMenu) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.interfaceMethod = interfaceMethod;
        this.defaultPlaybackQuality = defaultPlaybackQuality;
        this.displayMode = displayMode;
        this.tableShowPoster = tableShowPoster;
        this.tableShowName = tableShowName;
        this.tableShowRuntime = tableShowRuntime;
        this.tableShowGenre = tableShowGenre;
        this.tableShowMpaaRating = tableShowMpaaRating;
        this.tableShowUserRating = tableShowUserRating;
        this.tableShowLanguage = tableShowLanguage;
        this.tableShowReleaseDate = tableShowReleaseDate;
        this.tableShowActions = tableShowActions;
        this.homePageShowNewMovie = homePageShowNewMovie;
        this.homePageShowNewTvShow = homePageShowNewTvShow;
        this.homePageShowNewGame = homePageShowNewGame;
        this.homePageShowNewBook = homePageShowNewBook;
        this.homePageShowNewMusic = homePageShowNewMusic;
        this.homePageShowPopularMovie = homePageShowPopularMovie;
        this.homePageShowPopularTvShow = homePageShowPopularTvShow;
        this.homePageShowPopularGame = homePageShowPopularGame;
        this.homePageShowPopularBook = homePageShowPopularBook;
        this.homePageShowPopularMusic = homePageShowPopularMusic;
        this.maxSearchResults = maxSearchResults;
        this.maxBrowseResults = maxBrowseResults;
        this.fontSize = fontSize;
        this.fontType = fontType;
        this.fontColor = fontColor;
        this.cardWidth = cardWidth;
        this.stickyTopMenu = stickyTopMenu;
    }

    public UserSettingsEntity(InterfaceMethodEnum interfaceMethod,
                              PlaybackQualityEnum defaultPlaybackQuality,
                              DisplayModeEnum displayMode,
                              boolean tableShowPoster,
                              boolean tableShowName,
                              boolean tableShowRuntime,
                              boolean tableShowGenre,
                              boolean tableShowMpaaRating,
                              boolean tableShowUserRating,
                              boolean tableShowLanguage,
                              boolean tableShowReleaseDate,
                              boolean tableShowActions,
                              boolean homePageShowNewMovie,
                              boolean homePageShowNewTvShow,
                              boolean homePageShowNewGame,
                              boolean homePageShowNewBook,
                              boolean homePageShowNewMusic,
                              boolean homePageShowPopularMovie,
                              boolean homePageShowPopularTvShow,
                              boolean homePageShowPopularGame,
                              boolean homePageShowPopularBook,
                              boolean homePageShowPopularMusic,
                              int maxSearchResults,
                              int maxBrowseResults,
                              int fontSize,
                              String fontType,
                              String fontColor,
                              int cardWidth,
                              boolean stickyTopMenu) {
        this.interfaceMethod = interfaceMethod;
        this.defaultPlaybackQuality = defaultPlaybackQuality;
        this.displayMode = displayMode;
        this.tableShowPoster = tableShowPoster;
        this.tableShowName = tableShowName;
        this.tableShowRuntime = tableShowRuntime;
        this.tableShowGenre = tableShowGenre;
        this.tableShowMpaaRating = tableShowMpaaRating;
        this.tableShowUserRating = tableShowUserRating;
        this.tableShowLanguage = tableShowLanguage;
        this.tableShowReleaseDate = tableShowReleaseDate;
        this.tableShowActions = tableShowActions;
        this.homePageShowNewMovie = homePageShowNewMovie;
        this.homePageShowNewTvShow = homePageShowNewTvShow;
        this.homePageShowNewGame = homePageShowNewGame;
        this.homePageShowNewBook = homePageShowNewBook;
        this.homePageShowNewMusic = homePageShowNewMusic;
        this.homePageShowPopularMovie = homePageShowPopularMovie;
        this.homePageShowPopularTvShow = homePageShowPopularTvShow;
        this.homePageShowPopularGame = homePageShowPopularGame;
        this.homePageShowPopularBook = homePageShowPopularBook;
        this.homePageShowPopularMusic = homePageShowPopularMusic;
        this.maxSearchResults = maxSearchResults;
        this.maxBrowseResults = maxBrowseResults;
        this.fontSize = fontSize;
        this.fontType = fontType;
        this.fontColor = fontColor;
        this.cardWidth = cardWidth;
        this.stickyTopMenu = stickyTopMenu;
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
    public InterfaceMethodEnum getInterfaceMethod() {
        return interfaceMethod;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public PlaybackQualityEnum getDefaultPlaybackQuality() {
        return defaultPlaybackQuality;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public DisplayModeEnum getDisplayMode() {
        return displayMode;
    }

    @Serialize(order = 6)
    public boolean isTableShowPoster() {
        return tableShowPoster;
    }

    @Serialize(order = 7)
    public boolean isTableShowName() {
        return tableShowName;
    }

    @Serialize(order = 8)
    public boolean isTableShowRuntime() {
        return tableShowRuntime;
    }

    @Serialize(order = 9)
    public boolean isTableShowGenre() {
        return tableShowGenre;
    }

    @Serialize(order = 10)
    public boolean isTableShowMpaaRating() {
        return tableShowMpaaRating;
    }

    @Serialize(order = 11)
    public boolean isTableShowUserRating() {
        return tableShowUserRating;
    }

    @Serialize(order = 12)
    public boolean isTableShowLanguage() {
        return tableShowLanguage;
    }

    @Serialize(order = 13)
    public boolean isTableShowReleaseDate() {
        return tableShowReleaseDate;
    }

    @Serialize(order = 14)
    public boolean isTableShowActions() {
        return tableShowActions;
    }

    @Serialize(order = 15)
    public boolean isHomePageShowNewMovie() {
        return homePageShowNewMovie;
    }

    @Serialize(order = 16)
    public boolean isHomePageShowNewTvShow() {
        return homePageShowNewTvShow;
    }

    @Serialize(order = 17)
    public boolean isHomePageShowNewGame() {
        return homePageShowNewGame;
    }

    @Serialize(order = 18)
    public boolean isHomePageShowNewBook() {
        return homePageShowNewBook;
    }

    @Serialize(order = 19)
    public boolean isHomePageShowNewMusic() {
        return homePageShowNewMusic;
    }

    @Serialize(order = 20)
    public boolean isHomePageShowPopularMovie() {
        return homePageShowPopularMovie;
    }

    @Serialize(order = 21)
    public boolean isHomePageShowPopularTvShow() {
        return homePageShowPopularTvShow;
    }

    @Serialize(order = 22)
    public boolean isHomePageShowPopularGame() {
        return homePageShowPopularGame;
    }

    @Serialize(order = 23)
    public boolean isHomePageShowPopularBook() {
        return homePageShowPopularBook;
    }

    @Serialize(order = 24)
    public boolean isHomePageShowPopularMusic() {
        return homePageShowPopularMusic;
    }

    @Serialize(order = 25)
    public int getMaxSearchResults() {
        return maxSearchResults;
    }

    @Serialize(order = 26)
    public int getMaxBrowseResults() {
        return maxBrowseResults;
    }

    @Serialize(order = 27)
    public int getFontSize() {
        return fontSize;
    }

    @Serialize(order = 28)
    @SerializeNullable
    public String getFontType() {
        return fontType;
    }

    @Serialize(order = 29)
    @SerializeNullable
    public String getFontColor() {
        return fontColor;
    }

    @Serialize(order = 30)
    public int getCardWidth() {
        return cardWidth;
    }

    @Serialize(order = 31)
    public boolean isStickyTopMenu() {
        return stickyTopMenu;
    }
}
