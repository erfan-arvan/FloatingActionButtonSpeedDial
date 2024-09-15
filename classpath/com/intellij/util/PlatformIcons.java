/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
Workaround for https://youtrack.jetbrains.com/issue/IDEA-178656
UAST: Some UAST classes require PlatformIcons to be present
Alternative version of PlatformIcons which doesn't actually reference AllIcons.
*/
package com.intellij.util;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jetbrains.annotations.NonNls;

@SuppressWarnings("unused")
public interface PlatformIcons {
    Icon DUMMY = new ImageIcon();

    @NonNls
    String PUBLIC_ICON_PATH = "/nodes/c_public.png";
    Icon PUBLIC_ICON = DUMMY;
    Icon LOCKED_ICON = DUMMY;
    Icon SYMLINK_ICON = DUMMY;
    Icon PRIVATE_ICON = DUMMY;
    Icon PROTECTED_ICON = DUMMY;
    Icon PACKAGE_LOCAL_ICON = DUMMY;
    Icon PACKAGE_ICON = DUMMY;
    Icon DIRECTORY_CLOSED_ICON = DUMMY;
    @Deprecated
    Icon DIRECTORY_OPEN_ICON = DUMMY;
    @NonNls
    String CLASS_ICON_PATH = "/nodes/class.png";
    Icon CLASS_ICON = DUMMY;
    Icon EXCEPTION_CLASS_ICON = DUMMY;
    Icon NEW_EXCEPTION = DUMMY;
    Icon ANONYMOUS_CLASS_ICON = DUMMY;
    Icon ABSTRACT_CLASS_ICON = DUMMY;
    Icon ANNOTATION_TYPE_ICON = DUMMY;
    Icon ENUM_ICON = DUMMY;
    Icon INTERFACE_ICON = DUMMY;
    Icon METHOD_ICON = DUMMY;
    Icon FUNCTION_ICON = DUMMY;
    Icon ABSTRACT_METHOD_ICON = DUMMY;
    Icon FIELD_ICON = DUMMY;
    Icon PARAMETER_ICON = DUMMY;
    Icon VARIABLE_ICON = DUMMY;
    Icon XML_TAG_ICON = DUMMY;
    Icon LIBRARY_ICON = DUMMY;
    Icon WEB_ICON = DUMMY;
    Icon JAR_ICON = DUMMY;
    Icon FILE_ICON = DUMMY;
    Icon VARIABLE_READ_ACCESS = DUMMY;
    Icon VARIABLE_WRITE_ACCESS = DUMMY;
    Icon VARIABLE_RW_ACCESS = DUMMY;
    Icon CUSTOM_FILE_ICON = DUMMY;
    Icon PROPERTY_ICON = DUMMY;
    Icon NEW_PARAMETER = DUMMY;
    Icon ASPECT_ICON = DUMMY;
    Icon ADVICE_ICON = DUMMY;
    Icon ERROR_INTRODUCTION_ICON = DUMMY;
    Icon WARNING_INTRODUCTION_ICON = DUMMY;
    Icon JAVA_OUTSIDE_SOURCE_ICON = DUMMY;
    Icon EXCLUDED_FROM_COMPILE_ICON = DUMMY;
    Icon PROJECT_ICON = DUMMY;
    Icon UI_FORM_ICON = DUMMY;
    Icon JSP_ICON = DUMMY;
    Icon SMALL_VCS_CONFIGURABLE = DUMMY;
    Icon GROUP_BY_PACKAGES = DUMMY;
    Icon ADD_ICON = DUMMY;
    Icon DELETE_ICON = DUMMY;
    Icon COPY_ICON = DUMMY;
    Icon EDIT = DUMMY;
    Icon ANALYZE = DUMMY;
    Icon SELECT_ALL_ICON = DUMMY;
    Icon UNSELECT_ALL_ICON = DUMMY;
    Icon PROPERTIES_ICON = DUMMY;
    Icon SYNCHRONIZE_ICON = DUMMY;
    Icon SHOW_SETTINGS_ICON = DUMMY;
    Icon CHECK_ICON = DUMMY;
    Icon CHECK_ICON_SELECTED = DUMMY;
    Icon CHECK_ICON_SMALL = DUMMY;
    Icon CHECK_ICON_SMALL_SELECTED = DUMMY;
    Icon OPEN_EDIT_DIALOG_ICON = DUMMY;
    Icon FLATTEN_PACKAGES_ICON = DUMMY;
    Icon EDIT_IN_SECTION_ICON = DUMMY;
    Icon CLASS_INITIALIZER = DUMMY;
    Icon CLOSED_MODULE_GROUP_ICON = DUMMY;
    @Deprecated
    Icon OPENED_MODULE_GROUP_ICON = DUMMY;
    Icon FOLDER_ICON = DUMMY;
    Icon SOURCE_FOLDERS_ICON = DUMMY;
    Icon TEST_SOURCE_FOLDER = DUMMY;
    Icon INVALID_ENTRY_ICON = DUMMY;
    Icon MODULES_SOURCE_FOLDERS_ICON = DUMMY;
    Icon MODULES_TEST_SOURCE_FOLDER = DUMMY;
    Icon CONTENT_ROOT_ICON_CLOSED = DUMMY;
    @Deprecated
    Icon CONTENT_ROOT_ICON_OPEN = DUMMY;
    Icon UP_DOWN_ARROWS = DUMMY;
    Icon COMBOBOX_ARROW_ICON = DUMMY;
    Icon EXPORT_ICON = DUMMY;
    Icon IMPORT_ICON = DUMMY;
}
