package hcm.ditagis.com.tdns.qlts.utities;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import hcm.ditagis.com.tdns.qlts.R;

/**
 * Created by ThanLe on 5/8/2018.
 */

public class ListConfig {
    private static Context mContext;
    private static ListConfig instance = null;

    public static ListConfig getInstance(Context context) {
        if (instance == null)
            instance = new ListConfig();
        mContext = context;
        return instance;
    }

    private ListConfig() {
    }

    public List<Config> getConfigs() {
        List<Config> configs = new ArrayList<>();
        //        CONFIG BASEMAP
//        configs.add(new Config(mContext.getResources().getString(R.string.URL_TIM_DUONG),mContext.getResources().getString(R.string.ID_TIM_DUONG), mContext.getResources().getString(R.string.TITLE_TIM_DUONG), mContext.getResources().getInteger(R.integer.MIN_SCALE_TIM_DUONG), mContext.getString(R.string.GROUP_BASE_MAP)));
//        configs.add(new Config(mContext.getResources().getString(R.string.URL_TIM_SONG),mContext.getResources().getString(R.string.ID_TIM_SONG), mContext.getResources().getString(R.string.TITLE_TIM_SONG), mContext.getResources().getInteger(R.integer.MIN_SCALE_TIM_SONG), mContext.getString(R.string.GROUP_BASE_MAP)));
//        configs.add(new Config(mContext.getResources().getString(R.string.URL_SONG_HO),mContext.getResources().getString(R.string.ID_SONG_HO), mContext.getResources().getString(R.string.TITLE_SONG_HO), mContext.getResources().getInteger(R.integer.MIN_SCALE_SONG_HO), mContext.getString(R.string.GROUP_BASE_MAP)));
//        configs.add(new Config(mContext.getResources().getString(R.string.URL_GIAO_THONG),mContext.getResources().getString(R.string.ID_GIAO_THONG), mContext.getResources().getString(R.string.TITLE_GIAO_THONG), mContext.getResources().getInteger(R.integer.MIN_SCALE_GIAO_THONG), mContext.getString(R.string.GROUP_BASE_MAP)));
//        configs.add(new Config(mContext.getResources().getString(R.string.URL_THUA_DAT),mContext.getResources().getString(R.string.ID_THUA_DAT), mContext.getResources().getString(R.string.TITLE_THUA_DAT), mContext.getResources().getInteger(R.integer.MIN_SCALE_THUA_DAT), mContext.getString(R.string.GROUP_BASE_MAP)));
//        configs.add(new Config(mContext.getResources().getString(R.string.URL_PHUONG_XA),mContext.getResources().getString(R.string.ID_PHUONG_XA), mContext.getResources().getString(R.string.TITLE_PHUONG_XA), mContext.getResources().getInteger(R.integer.MIN_SCALE_PHUONG_XA), mContext.getString(R.string.GROUP_BASE_MAP)));
//        configs.add(new Config(mContext.getResources().getString(R.string.URL_HANH_CHINH),mContext.getResources().getString(R.string.ID_HANH_CHINH), mContext.getResources().getString(R.string.TITLE_HANH_CHINH), mContext.getResources().getInteger(R.integer.MIN_SCALE_HANH_CHINH), mContext.getString(R.string.GROUP_BASE_MAP)));

        configs.add(new Config(mContext.getResources().getString(R.string.URL_BASE_MAP),mContext.getResources().getString(R.string.ID_BASE_MAP), mContext.getResources().getString(R.string.TITLE_BASE_MAP), mContext.getString(R.string.GROUP_BASE_MAP)));
        configs.add(new Config(mContext.getResources().getString(R.string.URL_DONG_HO_TONG),
                mContext.getResources().getString(R.string.ID_DONG_HO_TONG),
                mContext.getResources().getString(R.string.TITLE_DONG_HO_TONG),
                mContext.getResources().getInteger(R.integer.MIN_SCALE_DONG_HO_TONG),
                mContext.getString(R.string.GROUP_TAI_SAN),
                mContext.getResources().getStringArray(R.array.UPDATE_FIELDS_DONG_HO_TONG)));
        configs.add(new Config(mContext.getResources().getString(R.string.URL_VAN),
                mContext.getResources().getString(R.string.ID_VAN),
                mContext.getResources().getString(R.string.TITLE_VAN),
                mContext.getResources().getInteger(R.integer.MIN_SCALE_VAN),
                mContext.getString(R.string.GROUP_TAI_SAN),
                mContext.getResources().getStringArray(R.array.UPDATE_FIELDS_VAN)));
        configs.add(new Config(mContext.getResources().getString(R.string.URL_MOI_NOI),
                mContext.getResources().getString(R.string.ID_MOI_NOI),
                mContext.getResources().getString(R.string.TITLE_MOI_NOI),
                mContext.getResources().getInteger(R.integer.MIN_SCALE_MOI_NOI),
                mContext.getString(R.string.GROUP_TAI_SAN),
                mContext.getResources().getStringArray(R.array.UPDATE_FIELDS_MOI_NOI)));
        configs.add(new Config(mContext.getResources().getString(R.string.URL_NHA_MAY_NUOC),
                mContext.getResources().getString(R.string.ID_NHA_MAY_NUOC),
                mContext.getResources().getString(R.string.TITLE_NHA_MAY_NUOC),
                mContext.getResources().getInteger(R.integer.MIN_SCALE_NHA_MAY_NUOC),
                mContext.getString(R.string.GROUP_TAI_SAN),
                mContext.getResources().getStringArray(R.array.UPDATE_FIELDS_NHA_MAY_NUOC)));

        configs.add(new Config(mContext.getResources().getString(R.string.URL_ONG_TRUYEN_DAN),
                mContext.getResources().getString(R.string.ID_ONG_TRUYEN_DAN),
                mContext.getResources().getString(R.string.TITLE_ONG_TRUYEN_DAN),
                mContext.getResources().getInteger(R.integer.MIN_SCALE_ONG_TRUYEN_DAN),
                mContext.getString(R.string.GROUP_TAI_SAN),
                mContext.getResources().getStringArray(R.array.UPDATE_FIELDS_ONG_TRUYEN_DAN)));

        configs.add(new Config(mContext.getResources().getString(R.string.URL_THAP_CAT_AP),
                mContext.getResources().getString(R.string.ID_THAP_CAT_AP),
                mContext.getResources().getString(R.string.TITLE_THAP_CAT_AP),
                mContext.getResources().getInteger(R.integer.MIN_SCALE_THAP_CAT_AP),
                mContext.getString(R.string.GROUP_TAI_SAN),
                mContext.getResources().getStringArray(R.array.UPDATE_FIELDS_THAP_CAT_AP)));
        configs.add(new Config(mContext.getResources().getString(R.string.URL_THUY_DAI),
                mContext.getResources().getString(R.string.ID_THUY_DAI),
                mContext.getResources().getString(R.string.TITLE_THUY_DAI),
                mContext.getResources().getInteger(R.integer.MIN_SCALE_THUY_DAI),
                mContext.getString(R.string.GROUP_TAI_SAN),
                mContext.getResources().getStringArray(R.array.UPDATE_FIELDS_THUY_DAI)));
        configs.add(new Config(mContext.getResources().getString(R.string.URL_TRU_HONG),
                mContext.getResources().getString(R.string.ID_TRU_HONG),
                mContext.getResources().getString(R.string.TITLE_TRU_HONG),
                mContext.getResources().getInteger(R.integer.MIN_SCALE_TRU_HONG),
                mContext.getString(R.string.GROUP_TAI_SAN),
                mContext.getResources().getStringArray(R.array.UPDATE_FIELDS_TRU_HONG)));
        configs.add(new Config(mContext.getResources().getString(R.string.URL_DON_VI),
                mContext.getResources().getString(R.string.ID_DON_VI),
                mContext.getResources().getString(R.string.TITLE_DON_VI),
                mContext.getResources().getInteger(R.integer.MIN_SCALE_DON_VI),
                mContext.getString(R.string.GROUP_TAI_SAN),
                mContext.getResources().getStringArray(R.array.UPDATE_FIELDS_DON_VI)));


        return configs;
    }
}
