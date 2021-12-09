import {Image, StyleSheet, Text, TouchableOpacity, TouchableWithoutFeedback, View} from "react-native";
import React from "react";

export default function Header({navigation}){
    const loadScene = () =>{
        navigation.navigate("Auth/confirm");

    }

    return (

            <View style={styles.viewStyle}>

                <View style={{ flex:1, flexDirection: 'row', justifyContent: 'flex-start' }}>
                    <Image source={require('../../../assets/Logo.png')} style={styles.imageStyle} />
                </View>

                <View style={{ flex:1, flexDirection: 'row', justifyContent: 'flex-end' }}>
                    <TouchableOpacity onPress={loadScene}>
                        <Image source={require('../../../assets/profile_icon.jpg')} style={styles.profileStyle} />
                    </TouchableOpacity>
                </View>
            </View>


    )
}


const styles = StyleSheet.create( {
    viewStyle: {
        marginTop: 50,
        marginLeft: 0,
        flex: 1,
        flexDirection: 'row',

        shadowColor: '#000',
        shadowOffset: { width: 0, height: 2 },
        shadowOpacity: 0.2,
        elevation: 2,
        position: 'relative'
    },
    imageStyle: {
        flex: 0,
        marginTop: 10,
        marginLeft: 10,
        width: 80,
        height: 28,
    },
    profileStyle: {
        flex:0,
        marginRight: 10,
        marginTop: 10,
        width: 50,
        height: 50,
        borderRadius: 50 / 2,
        overflow: "hidden",
        borderWidth: 1,
        borderColor: "gray"
    }
})
