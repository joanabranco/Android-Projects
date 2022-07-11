package com.example.aboutme.databinding;
import com.example.aboutme.R;
import com.example.aboutme.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nickname_edit, 3);
        sViewsWithIds.put(R.id.done_button, 4);
        sViewsWithIds.put(R.id.star_image, 5);
        sViewsWithIds.put(R.id.bio_scroll, 6);
        sViewsWithIds.put(R.id.imageView3, 7);
        sViewsWithIds.put(R.id.textView, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener nameTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myName.name
            //         is myName.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(nameText);
            // localize variables for thread safety
            // myName
            com.example.aboutme.MyName myName = mMyName;
            // myName.name
            java.lang.String myNameName = null;
            // myName != null
            boolean myNameJavaLangObjectNull = false;



            myNameJavaLangObjectNull = (myName) != (null);
            if (myNameJavaLangObjectNull) {




                myName.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener nicknameTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myName.nickname
            //         is myName.setNickname((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(nicknameText);
            // localize variables for thread safety
            // myName
            com.example.aboutme.MyName myName = mMyName;
            // myName.nickname
            java.lang.String myNameNickname = null;
            // myName != null
            boolean myNameJavaLangObjectNull = false;



            myNameJavaLangObjectNull = (myName) != (null);
            if (myNameJavaLangObjectNull) {




                myName.setNickname(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ScrollView) bindings[6]
            , (android.widget.Button) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[8]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameText.setTag(null);
        this.nicknameText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.myName == variableId) {
            setMyName((com.example.aboutme.MyName) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyName(@Nullable com.example.aboutme.MyName MyName) {
        this.mMyName = MyName;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.myName);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.aboutme.MyName myName = mMyName;
        java.lang.String myNameNickname = null;
        java.lang.String myNameName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (myName != null) {
                    // read myName.nickname
                    myNameNickname = myName.getNickname();
                    // read myName.name
                    myNameName = myName.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameText, myNameName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.nicknameText, myNameNickname);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nameText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameTextandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nicknameText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nicknameTextandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): myName
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}